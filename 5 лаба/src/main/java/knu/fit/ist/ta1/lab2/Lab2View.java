package knu.fit.ist.ta1.lab2;

import java.text.DecimalFormat;
import org.springframework.stereotype.Service;

/**
 *
 * @author Владимир
 */
@Service
public class Lab2View {

    DecimalFormat df = new DecimalFormat("###.##");

    public String showResult(String xString) {
        if (xString.equals("")) {
            return "Please enter x!";
        }
        Float x = Float.parseFloat(xString);

        if (x < 0) {
            return "Wrong x! It must be positive! Please try again.";
        } else {
            return df.format(Calculate.lab2equation(x));
        }
    }

}
