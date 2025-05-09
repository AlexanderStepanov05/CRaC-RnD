package org.springframework.samples.petclinic.system;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CrashControllerIntegrationTests}.
 */
@Generated
public class CrashControllerIntegrationTests__TestContext004_BeanDefinitions {
  /**
   * Bean definitions for {@link CrashControllerIntegrationTests.TestConfiguration}.
   */
  @Generated
  public static class TestConfiguration {
    /**
     * Get the bean definition for 'testConfiguration'.
     */
    public static BeanDefinition getTestConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(CrashControllerIntegrationTests.TestConfiguration.class);
      beanDefinition.setTargetType(CrashControllerIntegrationTests.TestConfiguration.class);
      ConfigurationClassUtils.initializeConfigurationClass(CrashControllerIntegrationTests.TestConfiguration.class);
      beanDefinition.setInstanceSupplier(CrashControllerIntegrationTests$TestConfiguration$$SpringCGLIB$$0::new);
      return beanDefinition;
    }
  }
}
