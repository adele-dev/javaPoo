public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

    public String whoAmI(){
        if (this.firstname.equals("Jean-Claude") && this.aware) {
            return String.format("Je m'appelle %s et je suis aware", this.firstname);
        }
        else {
            return String.format("Je m'appelle %s et je ne suis pas aware", this.firstname);
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

}
