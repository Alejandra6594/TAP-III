import java.awt.*;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConLayouts extends Frame implements ActionListener {
    Button btn;
    Button btns[];
    Panel p1;
    Panel p2;
    Panel p3;
    TextArea txt;
    public VentanaConLayouts() 
    {
        btn = new Button("cerrar");
        btns= new Button[10];
        for (int i=0;i<btns.length;i++)
        {
            btns [i]= new Button(i+"");
            btns[i].addActionListener(this);
        }
        btn.addActionListener(this);
        p1 = new Panel();
        for(int i =0;i<6;i++)
        {
            p1.add(btns[i]);
        }
        p2 = new Panel();
        for(int i =6;i<btns.length;i++)
        {
            p2.add(btns[i]);
        }
        p3 = new Panel();
        txt = new TextArea();
        this.setLayout(new BorderLayout());
        p1.setLayout(new GridLayout(3,2));
        p2.setLayout(new FlowLayout());
        p3.setLayout(new CardLayout());
        this.add(p1,BorderLayout.NORTH);
        this.add(p2,BorderLayout.SOUTH);
        this.add(p3,BorderLayout.CENTER);
        this.add(btn,BorderLayout.WEST);
        this.setSize(400,300);
        this.setVisible(true);
    }

    public static void main(String[] args) 
    {
        VentanaConLayouts v = new VentanaConLayouts();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // TODO Auto-generated method stub
        if (e.getSource()==btn)System.exit(0);
        else
        {
            System.out.println(e.getActionCommand());

        }
    }
}
