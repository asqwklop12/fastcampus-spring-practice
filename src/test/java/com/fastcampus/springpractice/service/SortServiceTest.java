package com.fastcampus.springpractice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fastcampus.springpractice.logic.BubbleSort;
import java.util.List;
import org.junit.jupiter.api.Test;

class SortServiceTest {

  // System under test
  private SortService sut = new SortService(new BubbleSort<>());

  @Test
  void test() {
    List<String> actual = sut.doSort(List.of("3", "2", "1"));
    assertEquals(List.of("1", "2", "3"), actual);
  }
}