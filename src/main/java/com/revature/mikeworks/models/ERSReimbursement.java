package com.revature.mikeworks.models;

import com.revature.mikeworks.enums.ERSReimbursementStatus;
import com.revature.mikeworks.enums.ERSReimbursementType;
import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;
import java.sql.Timestamp;

public class ERSReimbursement {
    @Getter @Setter private Long reimbID;
    @Getter @Setter private double amount;
    @Getter @Setter private Timestamp submitted;
    @Getter @Setter private Timestamp resolved;
    @Getter @Setter private String description;
    @Getter @Setter private Blob receipt; // type will change as S3 taught to us
    @Getter @Setter private Long author;
    @Getter @Setter private Long resolver;
    @Getter @Setter private ERSReimbursementStatus status;
    @Getter @Setter private ERSReimbursementType type;
}
