package edu.greenriver.sdev.numbergenerator.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class NumberService {
    public int between(int low, int high) {
        return new Random().nextInt(low, high);
    }

    public List<Integer> betweenLarge(int size, int low, int high) {
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            numList.add(new Random().nextInt(low, high));
        }
        return numList;
    }
}
