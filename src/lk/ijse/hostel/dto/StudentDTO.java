package lk.ijse.d24.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class StudentDTO {
    private String id;
    private String name;
    private int contact;
    private String address;
    private Date dob;
    private String gender;
    
}
