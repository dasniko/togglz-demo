package de.nko.togglz;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.InfoLink;
import org.togglz.core.annotation.Label;
import org.togglz.core.annotation.Owner;
import org.togglz.core.context.FeatureContext;

public enum MyFeatures implements Feature {

    @EnabledByDefault
    @Label("Fancy First Feature")
    MY_FANCY_FEATURE,

    @Label("Rainbow Unicorn Button")
    @Owner("@dasniko")
    @InfoLink("http://www.n-k.de")
    MY_FANCY_BUTTON,

    @Owner("@dasniko")
    @InfoLink("http://www.n-k.de")
    THIRD_FEATURE;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }

}
