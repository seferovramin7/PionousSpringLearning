package com.ltc.pionousspringlearning.config.feign;

import com.ltc.pionousspringlearning.dto.Launch;
import java.util.ArrayList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "rocket-client", url = "https://api.spacexdata.com/v2")
public interface RocketClient {


    @GetMapping("launches")
    ArrayList<Launch> getLaunches();

}
