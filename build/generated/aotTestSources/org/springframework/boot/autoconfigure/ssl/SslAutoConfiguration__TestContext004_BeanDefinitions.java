package org.springframework.boot.autoconfigure.ssl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.ssl.DefaultSslBundleRegistry;
import org.springframework.core.io.ResourceLoader;

/**
 * Bean definitions for {@link SslAutoConfiguration}.
 */
@Generated
public class SslAutoConfiguration__TestContext004_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration'.
   */
  private static BeanInstanceSupplier<SslAutoConfiguration> getSslAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SslAutoConfiguration>forConstructor(ResourceLoader.class, SslProperties.class)
            .withGenerator((registeredBean, args) -> new SslAutoConfiguration(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'sslAutoConfiguration'.
   */
  public static BeanDefinition getSslAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SslAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(getSslAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'fileWatcher'.
   */
  private static BeanInstanceSupplier<FileWatcher> getFileWatcherInstanceSupplier() {
    return BeanInstanceSupplier.<FileWatcher>forFactoryMethod(SslAutoConfiguration.class, "fileWatcher")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration", SslAutoConfiguration.class).fileWatcher());
  }

  /**
   * Get the bean definition for 'fileWatcher'.
   */
  public static BeanDefinition getFileWatcherBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(FileWatcher.class);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setFactoryBeanName("org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration");
    beanDefinition.setInstanceSupplier(getFileWatcherInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'sslPropertiesSslBundleRegistrar'.
   */
  private static BeanInstanceSupplier<SslPropertiesBundleRegistrar> getSslPropertiesSslBundleRegistrarInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SslPropertiesBundleRegistrar>forFactoryMethod(SslAutoConfiguration.class, "sslPropertiesSslBundleRegistrar", FileWatcher.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration", SslAutoConfiguration.class).sslPropertiesSslBundleRegistrar(args.get(0)));
  }

  /**
   * Get the bean definition for 'sslPropertiesSslBundleRegistrar'.
   */
  public static BeanDefinition getSslPropertiesSslBundleRegistrarBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SslPropertiesBundleRegistrar.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration");
    beanDefinition.setInstanceSupplier(getSslPropertiesSslBundleRegistrarInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'sslBundleRegistry'.
   */
  private static BeanInstanceSupplier<DefaultSslBundleRegistry> getSslBundleRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultSslBundleRegistry>forFactoryMethod(SslAutoConfiguration.class, "sslBundleRegistry", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration", SslAutoConfiguration.class).sslBundleRegistry(args.get(0)));
  }

  /**
   * Get the bean definition for 'sslBundleRegistry'.
   */
  public static BeanDefinition getSslBundleRegistryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultSslBundleRegistry.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration");
    beanDefinition.setInstanceSupplier(getSslBundleRegistryInstanceSupplier());
    return beanDefinition;
  }
}
