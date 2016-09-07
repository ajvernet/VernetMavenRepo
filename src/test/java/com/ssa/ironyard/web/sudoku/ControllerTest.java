package com.ssa.ironyard.web.sudoku;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class ControllerTest {

    @Qualifier("default-games")
    
    
    SudokuRestController controller = new SudokuRestController();
    
    @Test
    public void easyGameTest() {
        System.out.println(controller.game("easy").toString());

    }
}
