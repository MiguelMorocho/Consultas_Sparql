package consultassparql;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.apache.jena.atlas.logging.LogCtl;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QueryParseException;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.sparql.engine.http.QueryEngineHTTP;

public class JFrameConsulta extends javax.swing.JFrame {

    public JFrameConsulta() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        buttonGroup2.add(radioButtonXML);
        buttonGroup2.add(radioButtonCSV);
        buttonGroup2.add(radioButtonJSON);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonEjecutar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEjemplo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        radioButtonXML = new javax.swing.JRadioButton();
        radioButtonCSV = new javax.swing.JRadioButton();
        radioButtonJSON = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        jLabel1.setText("Consultas Sparql");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonEjecutar.setText("Ejecutar");
        jButtonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEjecutarActionPerformed(evt);
            }
        });

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonEjemplo.setText("Ejecutar Ejemplo");
        jButtonEjemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEjemploActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEjemplo, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jButtonEjecutar)
                .addGap(18, 18, 18)
                .addComponent(jButtonNuevo)
                .addGap(18, 18, 18)
                .addComponent(jButtonEjemplo)
                .addGap(20, 20, 20))
        );

        jLabel2.setText("Consultar paises");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ecuador", "España", "Francia", "Alemania", "Italia", "Reino Unido", "Estados Unidos", "México", "Argentina", "Brasil", "Colombia", "Perú", "Afganistán", "Albania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Armenia", "Australia ", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        radioButtonXML.setText("XML");

        radioButtonCSV.setText("CSV");

        radioButtonJSON.setText("JSON");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonXML)
                    .addComponent(radioButtonCSV)
                    .addComponent(radioButtonJSON))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioButtonXML)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(radioButtonCSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonJSON)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setText("Ejemplo de consulta acerca de: el idioma, la moneda, el himno nacional y la capital del país seleccionado.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEjemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEjemploActionPerformed

        jTextArea1.setEnabled(false);
        String uri = getUri(jComboBox1.getSelectedItem().toString());

        String consultaStr = "PREFIX wdt: <http://www.wikidata.org/prop/direct/>\n"
                + "PREFIX wd: <http://www.wikidata.org/entity/>\n"
                + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
                + "SELECT ?pais ?idioma ?moneda ?himno ?capital WHERE {\n"
                + "  ?pais wdt:P31 wd:Q3624078.\n"
                + "  ?pais wdt:P17 ?pais_lugar.\n"
                + "  ?pais wdt:P36 ?capital.\n"
                + "  ?pais wdt:P297 ?idioma.\n"
                + "  ?pais wdt:P38 ?moneda.\n"
                + "  OPTIONAL {?pais wdt:P85 ?himno.}\n"
                + "  FILTER(?pais = " + uri + ")\n"
                + " }";
        jTextArea1.setText(consultaStr);

        try {
            Query consulta = QueryFactory.create(consultaStr);
            QueryExecution ejecucion = QueryExecutionFactory.sparqlService("https://query.wikidata.org/sparql", consulta);

            ((QueryEngineHTTP) ejecucion).addParam("Timeout", "1000"); //tiempo de espera de consulta
            ResultSet resultados = ejecucion.execSelect();    //ejecuta consulta   

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);

            if (radioButtonXML.isSelected()) {
                ResultSetFormatter.out(ps, resultados);
                String output = baos.toString();
                jTextArea2.setText(output);
            } else if (radioButtonCSV.isSelected()) {
                ResultSetFormatter.outputAsCSV(ps, resultados);
                String output = baos.toString();
                jTextArea2.setText(output);
            } else if (radioButtonJSON.isSelected()) {
                ResultSetFormatter.outputAsJSON(ps, resultados);
                String output = baos.toString();
                jTextArea2.setText(output);
            }
            ejecucion.close();

        } catch (QueryParseException e) {
            System.out.println("Consulta mal construiuda" + e.getMessage());
            System.out.println("Línea: " + e.getLine() + "Columna: " + e.getColumn());
        }

    }//GEN-LAST:event_jButtonEjemploActionPerformed

    private void jButtonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEjecutarActionPerformed
        LogCtl.setCmdLogging(); //Salida de Registro en consola

        String consultaStr = jTextArea1.getText();

        try {
            Query consulta = QueryFactory.create(consultaStr);
            QueryExecution ejecucion = QueryExecutionFactory.sparqlService("https://query.wikidata.org/sparql", consulta);

            ((QueryEngineHTTP) ejecucion).addParam("Timeout", "1000"); //tiempo de espera de consulta
            ResultSet resultados = ejecucion.execSelect();    //ejecuta consulta   

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            ResultSetFormatter.out(System.out, resultados);
            if (radioButtonXML.isSelected()) {
                ResultSetFormatter.out(ps, resultados);
                String output = baos.toString();
                jTextArea2.setText(output);
            } else if (radioButtonCSV.isSelected()) {
                ResultSetFormatter.outputAsCSV(ps, resultados);
                String output = baos.toString();
                jTextArea2.setText(output);
            } else if (radioButtonJSON.isSelected()) {
                ResultSetFormatter.outputAsJSON(ps, resultados);
                String output = baos.toString();
                jTextArea2.setText(output);
            }
            ejecucion.close();

        } catch (QueryParseException e) {
            System.out.println("Consulta mal construiuda" + e.getMessage());
            System.out.println("Línea: " + e.getLine() + "Columna: " + e.getColumn());
        }
    }//GEN-LAST:event_jButtonEjecutarActionPerformed

    public static String getUri(String pais) {
        String uri = "";
        switch (pais) {
            case "Ecuador":
                uri = "wd:Q736";
                break;
            case "España":
                uri = "wd:Q29";
                break;
            case "Francia":
                uri = "wd:Q142";
                break;
            case "Alemania":
                uri = "wd:Q183";
                break;
            case "Italia":
                uri = "wd:Q38";
                break;
            case "Reino Unido":
                uri = "wd:Q145";
                break;
            case "Estados Unidos":
                uri = "wd:Q30";
                break;
            case "México":
                uri = "wd:Q96";
                break;
            case "Argentina":
                uri = "wd:Q414";
                break;
            case "Brasil":
                uri = "wd:Q155";
                break;
            case "Colombia":
                uri = "wd:Q739";
                break;
            case "Perú":
                uri = "wd:Q419";
                break;
            case "Afganistán":
                uri = "wd:Q889";
                break;
            case "Albania":
                uri = "wd:Q222";
                break;
            case "Andorra":
                uri = "wd:Q228";
                break;
            case "Angola":
                uri = "wd:Q916";
                break;
            case "Antigua y Barbuda":
                uri = "wd:Q781";
                break;
            case "Arabia Saudita":
                uri = "wd:Q851";
                break;
            case "Argelia":
                uri = "wd:Q262";
                break;
            case "Armenia":
                uri = "wd:Q399";
                break;
            case "Australia":
                uri = "wd:Q408";
                break;
            case "Austria":
                uri = "wd:Q40";
                break;
            case "Azerbaiyán":
                uri = "wd:Q227";
                break;
            case "Bahamas":
                uri = "wd:Q778";
                break;
            case "Bangladés":
                uri = "wd:Q902";
                break;
            case "Barbados":
                uri = "wd:Q244";
                break;
            case "Baréin":
                uri = "wd:Q398";
                break;
            case "Bélgica":
                uri = "wd:Q31";
                break;
            case "Belice":
                uri = "wd:Q242";
                break;
        }
        return uri;

    }
    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        this.jTextArea1.setText("");
        this.jTextArea2.setText("");
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonEjecutar;
    private javax.swing.JButton jButtonEjemplo;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton radioButtonCSV;
    private javax.swing.JRadioButton radioButtonJSON;
    private javax.swing.JRadioButton radioButtonXML;
    // End of variables declaration//GEN-END:variables

}
