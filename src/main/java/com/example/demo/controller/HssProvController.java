package com.example.demo.controller;

import com.example.demo.dto.HssProvDto;
import com.example.demo.service.HssProvServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/v1")
public class HssProvController {
    @Autowired
    private HssProvServiceImpl hssProvService;

    @RequestMapping(value = "/save/record", method = RequestMethod.POST)
    public ResponseEntity<HssProvDto> saveDetails(@RequestBody HssProvDto hssProvDto, HttpServletRequest httpServletRequest) throws JsonProcessingException {
        String authCode = httpServletRequest.getHeader("Authorization").replace("Bearer", "");
        return hssProvService.saveHssProv(hssProvDto, authCode);
    }

    @RequestMapping(value = "/update/record", method = RequestMethod.PUT)
    public ResponseEntity<HssProvDto> updateDetails(@RequestParam String imsi, @RequestParam String msisdn, @RequestBody HssProvDto hssProvDto) throws JsonProcessingException {
        return hssProvService.updateHssProv(imsi, msisdn, hssProvDto);
    }

    @RequestMapping(value = "/delete/record", method = RequestMethod.DELETE)
    public String deleteHssProvData(@RequestParam String imsi, @RequestParam String msisdn) {
        String msg = hssProvService.deleteHssProv(imsi, msisdn);
        return msg;
    }

}
