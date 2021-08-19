package com.fastcampus.springpractice;

import com.fastcampus.springpractice.config.Config;
import com.fastcampus.springpractice.service.SortService;
import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    SortService sortService = context.getBean(SortService.class);
    System.out.println("result" + sortService.doSort(Arrays.asList(args)));
  }
}
