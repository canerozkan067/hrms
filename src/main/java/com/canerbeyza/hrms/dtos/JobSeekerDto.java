package com.canerbeyza.hrms.dtos;

import com.canerbeyza.hrms.entities.JobSeeker;
import lombok.Data;

@Data
public class JobSeekerDto {

    private String firstName;
    private String lastName;
    private String nationalNo;
    private String birthDate;
    private String email;
    private String password;

    public JobSeekerDto(JobSeeker jobSeeker) {
        this.firstName = jobSeeker.getFirstName();
        this.lastName = jobSeeker.getLastName();
        this.nationalNo = jobSeeker.getNationalNo();
        this.birthDate = jobSeeker.getYearOfBirthDate();
    }

}
