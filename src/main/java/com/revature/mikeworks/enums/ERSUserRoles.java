package com.revature.mikeworks.enums;

public enum ERSUserRoles {
    EMPLOYEE, MANAGER;

    public static ERSUserRoles fromInt(int input) {
        switch (input) {
            case (1) -> {
                return MANAGER;
            }
            default -> {
                return EMPLOYEE;
            }
        }
    }

    public static int toInt(ERSUserRoles input) {
        switch (input) {
            case MANAGER -> {
                return 1;
            }
            default -> {
                return 0;
            }
        }
    }

    public static String toString(int wrongInput) {
        return ERSUserRoles.toString(ERSUserRoles.fromInt(wrongInput));
    }

    public static String toString(ERSUserRoles input) {
        switch (input) {
            case MANAGER -> {
                return "MANAGER";
            }
            default -> {
                return "EMPLOYEE";
            }
        }
    }
}
