package com.kpay.remit.distribution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpay.remit.distribution.dto.DistributionSaveRequestDto;
import com.kpay.remit.distribution.dto.DistributionSaveResponseDto;
import com.kpay.remit.distribution.service.DistributionService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class DistributionController {

	@Autowired
	private DistributionService distributionService;

	@PostMapping(value = "/distribution", produces = "application/json")
	public DistributionSaveResponseDto distributionSave(@RequestHeader("X-USER-ID") Long userId,
		@RequestHeader("X-ROOM-ID") Long roomId,
		@RequestBody DistributionSaveRequestDto requestDto) {
		return distributionService.distributionSave(userId, roomId, requestDto);
	}


}
