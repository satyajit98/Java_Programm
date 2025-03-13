interface Music
{
    void playMusic();
    void stopMusic();
}
interface SocialMedia
{
    void messege();
    void videoCall();
}
class SmartPhone implements SocialMedia, Music
{
    @Override
    public void playMusic(){
        System.out.println("Music getting played: bose bose vabi ami saradin");
    }
    @Override
    public void stopMusic(){
        System.out.println("music stopped");
    }
    @Override
    public void messege(){
        System.out.println("Messege is send to ____________");
    }
    @Override
    public void videoCall(){
        System.out.println("Video calling to _______________");
    }
    public void game(){
        System.out.println("Playing BGMI game");
    }
}

class MainSmartPhone
{
    public static void main(String [] args){
        SmartPhone sp = new SmartPhone();
        sp.playMusic();
        sp.stopMusic();
        sp.messege();
        sp.videoCall();
        sp.game();
    }
}