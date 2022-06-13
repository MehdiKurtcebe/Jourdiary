public class Recipe implements Comparable<Recipe>{
    private String nameOfRecipe;
    private String contentOfRecipe;

    Recipe(String str1){
        nameOfRecipe = str1;
        contentOfRecipe = new String("unknown");
    }
    
    Recipe(String str1, String str2){
        nameOfRecipe = str1;
        contentOfRecipe = str2;
    }

    public void setNameOfRecipe(String str){
        nameOfRecipe = str;
    }

    public void setContentOfRecipe(String str){
        contentOfRecipe = str;
    }

    public String getNameOfRecipe(){
        return nameOfRecipe;
    }

    public String getContentOfRecipe(){
        return contentOfRecipe;
    }

    @Override
    public int compareTo(Recipe o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
