/**
 * generated by Xtext
 */
package org.eclipse.xtext.generator.ecore.idea.facet;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import com.intellij.openapi.components.StorageScheme;
import org.eclipse.xtext.idea.facet.AbstractFacetConfiguration;
import org.eclipse.xtext.idea.facet.GeneratorConfigurationState;

@State(name = "org.eclipse.xtext.generator.ecore.SuperTestLanguageGenerator", storages = { @Storage(id = "default", file = StoragePathMacros.PROJECT_FILE), @Storage(id = "dir", file = (StoragePathMacros.PROJECT_CONFIG_DIR + "/SuperTestLanguageGeneratorConfig.xml"), scheme = StorageScheme.DIRECTORY_BASED) })
@SuppressWarnings("all")
public class SuperTestLanguageFacetConfiguration extends AbstractFacetConfiguration implements PersistentStateComponent<GeneratorConfigurationState> {
}
