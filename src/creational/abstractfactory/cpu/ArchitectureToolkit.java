package creational.abstractfactory.cpu;

/**
 * Created by dkocian on 12/13/13.
 */
public abstract class ArchitectureToolkit {
    private static final EmberToolkit emberToolkit = new EmberToolkit();
    private static final EnginolaToolkit enginolaToolkit = new EnginolaToolkit();
    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    static final ArchitectureToolkit getFactory(ARCH architecture)
    {
        switch (architecture)
        {
            case ENGINOLA:
                return enginolaToolkit;

            case EMBER:
                return emberToolkit;
        } // switch
        String errMsg = Integer.toString(architecture.ordinal());
        throw new IllegalArgumentException(errMsg);
    } // getFactory()

    public abstract CPU createCPU();
    public abstract MMU createMMU();

    public enum ARCH {
        ENGINOLA, EMBER
    }
}
