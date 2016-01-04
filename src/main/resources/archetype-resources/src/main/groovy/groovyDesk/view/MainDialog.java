#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.view;

import com.alibaba.druid.support.json.JSONUtils;
import ${package}.${artifactId}.dao.NdsChineseMapper;
import ${package}.${artifactId}.po.NdsChinese;
import ${package}.${artifactId}.po.NdsChineseExample;
import ${package}.${artifactId}.service.NdsChineseService;
import ${package}.${artifactId}.utils.MyContext;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.swing.*;
import java.awt.event.*;

public class MainDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextArea textArea1;

    public MainDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
// add your code here
        dispose();
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {

        MyContext.initContext();

//        NdsChineseService service = (NdsChineseService) MyContext.getApplicationContext().getBean("ndsChineseService");

        NdsChineseMapper mapper = MyContext.getApplicationContext().getBean(NdsChineseMapper.class);

        MainDialog dialog = new MainDialog();

        dialog.textArea1.setText(String.valueOf(JSONObject.fromObject(mapper.selectByExample(new NdsChineseExample()))));

        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public void setData(NdsChinese data) {
    }

    public void getData(NdsChinese data) {
    }

    public boolean isModified(NdsChinese data) {
        return false;
    }
}
