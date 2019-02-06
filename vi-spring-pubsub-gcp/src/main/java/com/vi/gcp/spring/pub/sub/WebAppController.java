package com.vi.gcp.spring.pub.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.vi.gcp.spring.pub.sub.PubSubApplication.PubsubOutboundGateway;

@RestController
public class WebAppController {

  // tag::autowireGateway[]
  @Autowired
  private PubsubOutboundGateway messagingGateway;
  // end::autowireGateway[]

  @PostMapping("/publishMessage")
  public RedirectView publishMessage(@RequestParam("message") String message) {
    messagingGateway.sendToPubsub(message);
    return new RedirectView("/");
  }
}
