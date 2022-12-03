package br.com.reclame.layout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

  @GetMapping("/")
  public String index() {
    return "index";
  }
  @GetMapping("/cadastro")
  public String cadastro() {
    return "cadastro";
  }
  @GetMapping("/login")
  public String login() {
    return "login";
  }
  @GetMapping("/reclamacao")
  public String reclamacao() {
    return "reclamacao";
  }
  @GetMapping("/etapas")
  public String etapas() {
    return "etapas";
  }
}
