/**
 * 
 */
package org.activiti.designer.kickstart.process.features;

import org.eclipse.graphiti.features.IFeatureProvider;

public abstract class AbstractCreateFastBPMNFeature extends AbstractCreateBPMNFeature {
	
  public AbstractCreateFastBPMNFeature(IFeatureProvider fp, String name, String description) {
    super(fp, name, description);
  }
}
