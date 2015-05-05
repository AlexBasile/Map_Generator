/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toby
 */
public class Window extends java.awt.Frame {

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        //inizializzo i due panel fornendo ad entrambi un mutuo riferimento
        scenePanel.init(menuPanel);
        menuPanel.init(scenePanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new MenuPannello();
        scenePanel = new ScenePanel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        add(menuPanel, java.awt.BorderLayout.EAST);

        scenePanel.setBackground(new java.awt.Color(255, 255, 255));
        scenePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                scenePanelMouseDragged(evt);
            }
        });
        scenePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scenePanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout scenePanelLayout = new javax.swing.GroupLayout(scenePanel);
        scenePanel.setLayout(scenePanelLayout);
        scenePanelLayout.setHorizontalGroup(
            scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        scenePanelLayout.setVerticalGroup(
            scenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        add(scenePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void scenePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scenePanelMouseClicked
        //ottengo dal menuPanel lo state impostato dai radiobutton di scelta
        int state = menuPanel.getState();

        //ottengo le coordinate del click e le passo allo scenePanel
        int x = (int) evt.getPoint().getX();
        int y = (int) evt.getPoint().getY();
        scenePanel.click(x, y, state);
    }//GEN-LAST:event_scenePanelMouseClicked

    private void scenePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scenePanelMouseDragged
        //ottengo dal menuPanel lo state impostato dai radiobutton di scelta
        int state = menuPanel.getState();

        //ottengo le coordinate del click e le passo allo scenePanel
        int x = (int) evt.getPoint().getX();
        int y = (int) evt.getPoint().getY();
        scenePanel.click(x, y, state);
    }//GEN-LAST:event_scenePanelMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MenuPannello menuPanel;
    private ScenePanel scenePanel;
    // End of variables declaration//GEN-END:variables
}
