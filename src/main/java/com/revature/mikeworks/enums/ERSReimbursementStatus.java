package com.revature.mikeworks.enums;

public enum ERSReimbursementStatus {
    PENDING, APPROVED, DENIED;

    public static ERSReimbursementStatus fromInt(int input) {
        switch (input) {
            case (1) -> {
                return APPROVED;
            }
            case (2) -> {
                return DENIED;
            }
            default -> {
                return PENDING;
            }
        }
    }

    public static int toInt(ERSReimbursementStatus input) {
        switch (input) {
            case APPROVED -> {
                return 1;
            }
            case DENIED -> {
                return 2;
            }
            default -> {
                return 0;
            }
        }
    }

    public static String toString(int wrongInput) {
        return ERSReimbursementStatus.toString(ERSReimbursementStatus.fromInt(wrongInput));
    }

    public static String toString(ERSReimbursementStatus input) {
        switch (input) {
            case APPROVED -> {
                return "APPROVED";
            }
            case DENIED -> {
                return "DENIED";
            }
            default -> {
                return "PENDING";
            }
        }
    }
}
