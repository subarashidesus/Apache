
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PokemonQuestion {
    // image path
    private String imgPath;
    
    //correct answer
    private String correctAnswer;
    
    // answer pool
    private List<String> answerList;
    
    public String getImgPath(){
        return imgPath;
    }
    
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    
    public List<String> getAnswerList(){
        return answerList;
    }
    
    public PokemonQuestion(int index){
        this.imgPath = "resources/pokemon" + (index + 1) + ".png";
        this.correctAnswer = findAnswerByIndex(index);
        this.answerList = loadAnswerPool();
    }
    
    private String findAnswerByIndex(int index){
        switch(index){
            case 0:
                return "Fuecoco";
            case 1:
                return "Sprigatito";
            case 2:
                return "Quaxly";
            case 3:
                return "Koraidon";
            case 4:
                return "Miraidon";
            case 5:
                return "Armarouge";
            case 6:
                return "Cetitan";
            case 7:
                return "Fidough";
            case 8:
                return "Lechonk";
            case 9:
                return "Pawmi";
        }
        return "";
    }
    
    private List<String> loadAnswerPool(){
        List<String> oAnswers = new ArrayList<>();
        Random rand = new Random();
        
        
        // add the correct answer to the list first
        oAnswers.add(correctAnswer);
        
        // store the rest of the 3 other answer to the list
        for(int i = 0; i < 3; i++){
            String option = PokemonDB.POKEMON_DB[rand.nextInt(PokemonDB.POKEMON_DB.length)];
            
            // validate to make sure that there is no repetition
            while(oAnswers.contains(option)){
                option = PokemonDB.POKEMON_DB[rand.nextInt(PokemonDB.POKEMON_DB.length)];
            }
            
            oAnswers.add(option);      
        }
        
        randomizeAnswer(oAnswers, rand.nextInt(oAnswers.size()));
        
        return oAnswers;
    }
    
    private void randomizeAnswer(List<String> answerList, int randIndex){
        if(randIndex == 0) return; // no point in switching with itself
        
        
        // we only need to switch with the correct answer as the rest is already randomized
        answerList.set(0, answerList.get(randIndex));
        answerList.set(randIndex, correctAnswer);
    }
    
}
