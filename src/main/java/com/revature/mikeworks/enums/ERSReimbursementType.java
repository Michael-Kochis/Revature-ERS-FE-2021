package com.revature.mikeworks.enums;

public enum ERSReimbursementType {
    LODGING, TRAVEL, FOOD, OTHER;

    public static ERSReimbursementType fromInt(Integer input) {
        switch(input) {
            case (1) -> {
                return LODGING;
            }
            case (2) -> {
                return TRAVEL;
            }
            case (3) -> {
                return FOOD;
            }
            default -> {
                return OTHER;
            }
        }
    }

    public static int toInt(ERSReimbursementType input) {
        switch (input) {
            case LODGING -> {
                return 1;
            }
            case TRAVEL -> {
                return 2;
            }
            case FOOD -> {
                return 3;
            }
            default -> {
                return 0;
            }
        }
    }

    public static String toString(int wrongInput) {
        return ERSReimbursementType.toString(ERSReimbursementType.fromInt(wrongInput));
    }

    public static String toString(ERSReimbursementType input) {
        switch (input) {
            case LODGING -> {
                return "LODGING";
            }
            case TRAVEL -> {
                return "TRAVEL";
            }
            case FOOD -> {
                return "FOOD";
            }
            default -> {
                return "OTHER";
            }
        }
    }
}
