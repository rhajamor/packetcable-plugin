package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.pcmm.service.impl.RpcRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.pcmm.service.impl.NotificationService;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl
 */
public class PcmmServiceImplBuilder {

    private RpcRegistry _rpcRegistry;
    private NotificationService _notificationService;

    private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>> augmentation = new HashMap<>();

    public PcmmServiceImplBuilder() {
    } 
    

    public PcmmServiceImplBuilder(PcmmServiceImpl base) {
        this._rpcRegistry = base.getRpcRegistry();
        this._notificationService = base.getNotificationService();
        if (base instanceof PcmmServiceImplImpl) {
            PcmmServiceImplImpl _impl = (PcmmServiceImplImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public RpcRegistry getRpcRegistry() {
        return _rpcRegistry;
    }
    
    public NotificationService getNotificationService() {
        return _notificationService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PcmmServiceImplBuilder setRpcRegistry(RpcRegistry value) {
        this._rpcRegistry = value;
        return this;
    }
    
    public PcmmServiceImplBuilder setNotificationService(NotificationService value) {
        this._notificationService = value;
        return this;
    }
    
    public PcmmServiceImplBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public PcmmServiceImpl build() {
        return new PcmmServiceImplImpl(this);
    }

    private static final class PcmmServiceImplImpl implements PcmmServiceImpl {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl.class;
        }

        private final RpcRegistry _rpcRegistry;
        private final NotificationService _notificationService;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>> augmentation = new HashMap<>();

        private PcmmServiceImplImpl(PcmmServiceImplBuilder base) {
            this._rpcRegistry = base.getRpcRegistry();
            this._notificationService = base.getNotificationService();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public RpcRegistry getRpcRegistry() {
            return _rpcRegistry;
        }
        
        @Override
        public NotificationService getNotificationService() {
            return _notificationService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.PcmmServiceImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_rpcRegistry == null) ? 0 : _rpcRegistry.hashCode());
            result = prime * result + ((_notificationService == null) ? 0 : _notificationService.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            PcmmServiceImplImpl other = (PcmmServiceImplImpl) obj;
            if (_rpcRegistry == null) {
                if (other._rpcRegistry != null) {
                    return false;
                }
            } else if(!_rpcRegistry.equals(other._rpcRegistry)) {
                return false;
            }
            if (_notificationService == null) {
                if (other._notificationService != null) {
                    return false;
                }
            } else if(!_notificationService.equals(other._notificationService)) {
                return false;
            }
            if (augmentation == null) {
                if (other.augmentation != null) {
                    return false;
                }
            } else if(!augmentation.equals(other.augmentation)) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("PcmmServiceImpl [");
            boolean first = true;
        
            if (_rpcRegistry != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_rpcRegistry=");
                builder.append(_rpcRegistry);
             }
            if (_notificationService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_notificationService=");
                builder.append(_notificationService);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
