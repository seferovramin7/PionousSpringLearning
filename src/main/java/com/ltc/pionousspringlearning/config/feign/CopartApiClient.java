package com.ltc.pionousspringlearning.config.feign;

import com.ltc.pionousspringlearning.dto.CopartCarDto;
import java.util.ArrayList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "copartApiClient", url = "https://api.apicar.store/public/docs/current_lots.json")
public interface CopartApiClient {

    @GetMapping()
    ArrayList<CopartCarDto> getCars();


}
