package bridge;

import java.util.List;

public class Bridge {
    private final List<String> bridge;

    public Bridge(List<String> randomBridge) {
        checkBridgeLength(randomBridge);
        bridge = randomBridge;
    }

    public boolean movable(String input, int index) {
        return bridge.get(index).equals(input);
    }

    private void checkBridgeLength(List<String> randomBridge) {
        if (randomBridge.size() < 3 || randomBridge.size() > 20) {
            throw new IllegalArgumentException(" 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
        }
    }
}
