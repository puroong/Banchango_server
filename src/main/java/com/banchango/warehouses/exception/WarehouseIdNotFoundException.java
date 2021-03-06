package com.banchango.warehouses.exception;

public class WarehouseIdNotFoundException extends WarehouseException{

    private static final long serialVersionUID = 1L;
    public static final String MESSAGE = "해당 id로 조회된 창고 결과가 없습니다.";

    public WarehouseIdNotFoundException() {
        super(MESSAGE);
    }
}
