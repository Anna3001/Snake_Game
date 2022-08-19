package sample;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Field extends Pane {
    private final int wth;
    private final int hth;           // width, height

    public Field(int width, int height) {
        this.wth = width;
        this.hth = height;

        setMinSize(wth * Main.block_size, hth * Main.block_size);
        setBackground(new Background(new BackgroundFill(Color.GRAY, null, null)));
        setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
    }
}
