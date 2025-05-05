package AST;

public class ComponentProperty {
    SelectorProperty selectorProperty;
    ImportsProperty importsProperty;
    StandaloneProperty standaloneProperty;
    StylesProperty stylesProperty;
    TemplateProperty templateProperty;

    public SelectorProperty getSelectorProperty() {
        return selectorProperty;
    }

    public void setSelectorProperty(SelectorProperty selectorProperty) {
        this.selectorProperty = selectorProperty;
    }

    public ImportsProperty getImportsProperty() {
        return importsProperty;
    }

    public void setImportsProperty(ImportsProperty importsProperty) {
        this.importsProperty = importsProperty;
    }

    public StandaloneProperty getStandaloneProperty() {
        return standaloneProperty;
    }

    public void setStandaloneProperty(StandaloneProperty standaloneProperty) {
        this.standaloneProperty = standaloneProperty;
    }

    public StylesProperty getStylesProperty() {
        return stylesProperty;
    }

    public void setStylesProperty(StylesProperty stylesProperty) {
        this.stylesProperty = stylesProperty;
    }

    public TemplateProperty getTemplateProperty() {
        return templateProperty;
    }

    public void setTemplateProperty(TemplateProperty templateProperty) {
        this.templateProperty = templateProperty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(selectorProperty!=null){
            sb.append(selectorProperty);
        }
        if(importsProperty!=null){
            sb.append(importsProperty);
        }if(standaloneProperty!=null){
            sb.append(standaloneProperty);
        }if(templateProperty!=null){
            sb.append(templateProperty);
        }
        if(stylesProperty!=null){
            sb.append(stylesProperty);
        }
        return sb.toString();
    }
}
