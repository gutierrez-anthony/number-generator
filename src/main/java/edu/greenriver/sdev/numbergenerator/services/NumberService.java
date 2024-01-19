package edu.greenriver.sdev.numbergenerator.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NumberService {
    public int between(int low, int high) {
        return new Random().nextInt(low, high);
    }
}
