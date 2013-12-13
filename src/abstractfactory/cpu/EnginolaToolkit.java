package abstractfactory.cpu;

/**
 * Created by dkocian on 12/13/13.
 */
class EnginolaToolkit extends ArchitectureToolkit{
    @Override
    public CPU createCPU() {
        return null;
    }

    @Override
    public MMU createMMU() {
        return null;
    }
}
