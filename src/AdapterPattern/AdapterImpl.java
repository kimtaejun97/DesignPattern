package AdapterPattern;

public class AdapterImpl implements Adapter {
    @Override
    public float twiceOf(float f) {
        return (float)Math.twoTime((double) f);
    }

    @Override
    public float halfOf(float f) {
        return (float)Math.twoTime((double) f);

    }

}
