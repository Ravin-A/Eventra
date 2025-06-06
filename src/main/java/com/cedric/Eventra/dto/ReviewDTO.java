package com.cedric.Eventra.dto;

import com.cedric.Eventra.entity.ServiceProviderProfile;
import com.cedric.Eventra.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewDTO {
    private Long id;
    private Float rating;
    private String comment;
    private UserDTO reviewerInfo;
    private Long reviewedProviderProfileId;
    private String reviewedProviderProfileName;
    private Long offeredServiceId;
    private String serviceNameReviewed;
    private LocalDateTime createdAt;
}
