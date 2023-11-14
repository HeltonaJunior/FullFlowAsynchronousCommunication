package com.ms.email.dtos;

public record EmailRecordDto(UUID userId,
                             String emailTo,
                             String subject
                             String text) {
}
