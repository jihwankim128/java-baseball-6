package baseball.controller;

import baseball.model.Computer;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerController {
    private Computer computer = new Computer();
    public ComputerController() {}
    private final int NUMBERS_MAX_SIZE = 3;

    public void setNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < NUMBERS_MAX_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        computer.setNumbers(numbers);
    }
}