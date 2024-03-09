package com.ltc.pionousspringlearning.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EmailDto {

    String from;
    String to;
    String subject;
    String message;


}
