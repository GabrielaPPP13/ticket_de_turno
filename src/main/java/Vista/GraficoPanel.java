package Vista;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class GraficoPanel extends JPanel {

    public GraficoPanel(Map<String, Integer> datos) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Agregar los datos al dataset
        for (Map.Entry<String, Integer> entry : datos.entrySet()) {
            dataset.addValue(entry.getValue(), "Solicitudes", entry.getKey());
        }

        // Crear el gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Solicitudes por Municipio", // Título del gráfico
                "Municipio", // Etiqueta del eje X
                "Solicitudes", // Etiqueta del eje Y
                dataset // Datos
        );

        // Personalizar el gráfico
        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setPaint(Color.black);

        // Crear un panel de gráfico y agregarlo a este panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        add(chartPanel);
    }
}
