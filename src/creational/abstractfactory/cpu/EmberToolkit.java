package creational.abstractfactory.cpu;

/**
 * Created by dkocian on 12/13/13.
 */
class EmberToolkit extends ArchitectureToolkit{
    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}
