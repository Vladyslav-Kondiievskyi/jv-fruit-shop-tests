package core.basesyntax.service.operation;

public class SupplyOperation implements OperationHandler {
    @Override
    public int process(int fruitTransactionQuantity, int currentFruitQuantity) {
        return fruitTransactionQuantity + currentFruitQuantity;
    }
}