SUMMARY = "User space mappable DMA Buffer"
DESCRIPTION = "u-dma-buf is a Linux device driver that allocates contiguous  \
               memory blocks in the kernel space as DMA buffers and makes \
               them available from the user space."
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bebf0492502927bef0741aa04d1f35f5"

SRCREV = "c8828301e794dbb7a2a7afbd1e75c00e0d7564bd"
SRC_URI = "git://github.com/ikwzm/udmabuf.git;protocol=https; \
	file://Makefile \
	"

S = "${WORKDIR}/git"

do_compile_prepend() {
	cp ${WORKDIR}/Makefile ${S}/
}

inherit module
