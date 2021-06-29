
package IP12.proniaieva.lab1;

/**
 *
 * @author proniaieva
 */
public class Lab1 {
     private int _score;
    
    public Lab1(){
        _score = 20;
    }
    
    public Lab1(int score){
        _score = score;
    }

    public int getScore() {
        return _score;
    }

    public void setScore(int score) {
        _score = score;
    }

    @Override
    public String toString() {
        return "Score = " + _score;
    }
    
    public void MoreScore(int value)
    {
        _score += value;
    }
    
     public void LessScore(int value)
    {
        _score -= value;
    }
}
