package com.amcjt.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jbhim
 * @date 2018/5/6/006.
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {
    @GetMapping("auth")
    public void auth(@RequestParam("code") String code) {
        log.info("进入auth方法>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        log.info("code={}", code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx614a4968b0f04dd4&secret=622725cf17338f65dafe51b4dbb9f7f2&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        log.info("response={}", response);
    }
}
