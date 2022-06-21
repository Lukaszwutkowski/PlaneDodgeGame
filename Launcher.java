import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Launcher
{
    public static void main (String[] args)
    {
        Game myGame = new PlaneDodgerGame();
        LwjglApplication launcher = new LwjglApplication( myGame, "Plane Dodgergit", 800, 600 );
    }
}