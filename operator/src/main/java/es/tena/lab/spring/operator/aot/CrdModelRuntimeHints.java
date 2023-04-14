package es.tena.lab.spring.operator.aot;

import es.tena.lab.spring.operator.models.V1SpringDeploymentList;
import es.tena.lab.spring.operator.models.V1SpringDeploymentSpec;
import es.tena.lab.spring.operator.models.V1SpringDeployment;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;

public class CrdModelRuntimeHints implements RuntimeHintsRegistrar {

    private final MemberCategory[] allMemberCategories = MemberCategory.values();

    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        hints.reflection()
            .registerType(V1SpringDeployment.class, allMemberCategories)
            .registerType(V1SpringDeploymentSpec.class, allMemberCategories)
            .registerType(V1SpringDeploymentList.class, allMemberCategories);
    }
}
