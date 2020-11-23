package com.kpay.remit.distribution.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.kpay.remit.model.Receive;

import lombok.Data;

@Data
public class DistributionListResponseDto {
	private LocalDateTime distributionDateTime;
	private int amount;
	private List<Receive> receiveList;

}