public class AnalysisLibrary {
    public void analyzeInformation(String json) throws Exception {
        if (!validateJSON(json)) {
            throw new Exception("La información no tiene formato JSON");
        }

        //Procesa la informacion obtenida en JSON
        System.out.println("Procesando la información...");
    }

    public boolean validateJSON(String json) {
        //Valida si la información llega en formato JSON
        return true;
    }
}